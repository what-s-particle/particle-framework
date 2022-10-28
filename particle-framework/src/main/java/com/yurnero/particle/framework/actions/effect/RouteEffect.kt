package com.yurnero.particle.framework.actions.effect

import com.yurnero.particle.framework.component.route.LaunchMode
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class RouteEffect(var id: String, var mode: LaunchMode)
