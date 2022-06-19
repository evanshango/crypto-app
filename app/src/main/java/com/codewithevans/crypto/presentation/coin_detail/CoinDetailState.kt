package com.codewithevans.crypto.presentation.coin_detail

import com.codewithevans.crypto.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)