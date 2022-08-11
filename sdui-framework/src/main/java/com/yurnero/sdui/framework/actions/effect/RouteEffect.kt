package com.yurnero.sdui.framework.actions.effect

import com.yurnero.sdui.framework.component.route.LaunchMode
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class RouteEffect(val id: String, val mode: LaunchMode)
