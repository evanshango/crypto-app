package com.codewithevans.crypto.data.repository

import com.codewithevans.crypto.data.remote.CoinPaprikaApi
import com.codewithevans.crypto.data.remote.dto.CoinDetailDto
import com.codewithevans.crypto.data.remote.dto.CoinDto
import com.codewithevans.crypto.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val paprikaApi: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> = paprikaApi.getCoins()

    override suspend fun getCoinById(coinId: String): CoinDetailDto = paprikaApi.getCoinById(coinId)
}