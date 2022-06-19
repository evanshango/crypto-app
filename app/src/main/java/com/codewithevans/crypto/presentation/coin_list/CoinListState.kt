package com.codewithevans.crypto.presentation.coin_list

import com.codewithevans.crypto.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)