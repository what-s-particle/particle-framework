package com.yurnero.sc.framework.actions.effect

import com.yurnero.sc.framework.actions.Effect
import com.yurnero.sc.framework.actions.effect.model.RequestType
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class HttpRequestEffect(
    var path: String,
    var requestData: MutableMap<String, String>? = mutableMapOf(),
    var requestType: RequestType,
    var successEffects: MutableList<Effect>? = mutableListOf(),
    var failedEffects: MutableList<Effect>? = mutableListOf()
)
