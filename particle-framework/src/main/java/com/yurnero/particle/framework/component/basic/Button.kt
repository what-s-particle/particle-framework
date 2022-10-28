package com.yurnero.particle.framework.component.basic

import com.yurnero.particle.framework.Particle
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Button(
    var content: Particle? = null,
    var enabled: Boolean? = null
)
