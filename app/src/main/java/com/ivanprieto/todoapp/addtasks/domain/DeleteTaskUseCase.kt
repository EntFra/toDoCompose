package com.ivanprieto.todoapp.addtasks.domain

import com.ivanprieto.todoapp.addtasks.data.TaskRepository
import com.ivanprieto.todoapp.addtasks.userinterface.model.TaskModel
import javax.inject.Inject

class DeleteTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.delete(taskModel)
    }
}