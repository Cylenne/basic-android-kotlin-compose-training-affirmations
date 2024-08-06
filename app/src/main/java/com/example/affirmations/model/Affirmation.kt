package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// The model package will contain the data model that will be represented by a data class.

data class Affirmation(
    @StringRes val stringResourceId: Int, // ID for the affirmation text
    @DrawableRes val imageResourceId: Int // ID for the affirmation image
)