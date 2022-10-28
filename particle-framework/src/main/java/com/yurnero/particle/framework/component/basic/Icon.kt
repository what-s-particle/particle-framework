package com.yurnero.particle.framework.component.basic

import com.yurnero.particle.framework.component.graphics.ColorToken
import com.yurnero.particle.framework.component.graphics.SizeToken
import kotlinx.serialization.Serializable

@Serializable
data class Icon(
    val name: String,
    val color: ColorToken?,
    val size: SizeToken?,
    // TODO An enumeration type is required here
    val style: String?
)
