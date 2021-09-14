package com.example.domain.usecase.di

import com.example.domain.repository.UserProfileRepository
import com.example.domain.usecase.GetUserProfileUseCase
import com.example.domain.usecase.GetUserProfileUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
class UserProfileModule {

    @Provides
    @ActivityRetainedScoped
    fun provideGetUserProfileUseCase(userProfileRepository: UserProfileRepository):
            GetUserProfileUseCase {
        return GetUserProfileUseCaseImpl(userProfileRepository)
    }
}