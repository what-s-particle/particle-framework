package com.yurnero.sdui.framework.actions.effect

import com.yurnero.sdui.framework.actions.Effect
import com.yurnero.sdui.framework.actions.effect.model.RequestType
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class HttpRequestEffect(
    val path: String,
    val requestData: MutableMap<String, String>? = mutableMapOf(),
    val requestType: RequestType,
    val successEffects: MutableList<Effect>? = mutableListOf(),
    val failedEffects: MutableList<Effect>? = mutableListOf()
)
