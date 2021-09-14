package com.example.domain.usecase

import com.example.domain.Response
import com.example.domain.model.UserProfileRequestUiModel
import com.example.domain.model.UserProfileResponseUiModel
import com.example.domain.repository.UserProfileRepository
import kotlinx.coroutines.flow.Flow

interface GetUserProfileUseCase {
    fun getUserProfile(request: UserProfileRequestUiModel): Flow<Response<UserProfileResponseUiModel>>
}

class GetUserProfileUseCaseImpl(private val repository: UserProfileRepository) :
    GetUserProfileUseCase {
    override fun getUserProfile(request: UserProfileRequestUiModel): Flow<Response<UserProfileResponseUiModel>> {
        return repository
            .getUserProfile(request)
    }
}