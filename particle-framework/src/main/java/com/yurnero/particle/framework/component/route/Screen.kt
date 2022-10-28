package com.yurnero.particle.framework.component.route

import com.yurnero.particle.framework.Particle
import kotlinx.serialization.Serializable


/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Screen(
    var id: String,
    var content: Particle? = null,
    var active: Boolean = false
)
