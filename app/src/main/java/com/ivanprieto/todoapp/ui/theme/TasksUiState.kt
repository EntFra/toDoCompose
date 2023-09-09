package com.ivanprieto.todoapp.ui.theme

import com.ivanprieto.todoapp.addtasks.userinterface.model.TaskModel

sealed interface TasksUiState {
    object Loading:TasksUiState
    data class Error(val throwable: Throwable): TasksUiState
    data class Success(val tasks:List<TaskModel>): TasksUiState
}