package com.yurnero.sc.framework.actions.effect

import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 *
 * In many cases, the component knows its own action, so it is carried when it is initialized.
 * But not all scenarios are like this.
 * If we don't know what to do at first, we can reserve and let the client ask.
 */
@Serializable
data class AskForNextActionsEffect(
    var path: String,
    var requestData: MutableMap<String, String>? = mutableMapOf(),
)
