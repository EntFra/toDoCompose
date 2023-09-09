package com.ivanprieto.todoapp.addtasks.domain

import com.ivanprieto.todoapp.addtasks.data.TaskRepository
import com.ivanprieto.todoapp.addtasks.userinterface.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    operator fun invoke(): Flow<List<TaskModel>> = taskRepository.tasks

}