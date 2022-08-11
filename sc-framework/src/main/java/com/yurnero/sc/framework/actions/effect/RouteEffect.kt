package com.yurnero.sc.framework.actions.effect

import com.yurnero.sc.framework.component.route.LaunchMode
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class RouteEffect(var id: String, var mode: LaunchMode)
