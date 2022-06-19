package com.codewithevans.crypto.domain.repository

import com.codewithevans.crypto.data.remote.dto.CoinDetailDto
import com.codewithevans.crypto.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}