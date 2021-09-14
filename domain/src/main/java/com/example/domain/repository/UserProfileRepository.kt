package com.example.domain.repository

import com.example.domain.Response
import com.example.domain.model.UserProfileRequestUiModel
import com.example.domain.model.UserProfileResponseUiModel
import kotlinx.coroutines.flow.Flow

interface UserProfileRepository {
    fun getUserProfile(request: UserProfileRequestUiModel): Flow<Response<UserProfileResponseUiModel>>
}