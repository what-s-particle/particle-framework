package com.yurnero.sc.framework.component.layout

import com.yurnero.sc.framework.component.graphics.SizeToken
import kotlinx.serialization.Serializable

@Serializable
data class PaddingModifier(
    val start: SizeToken = SizeToken.NONE,
    val top: SizeToken = SizeToken.NONE,
    val end: SizeToken = SizeToken.NONE,
    val bottom: SizeToken = SizeToken.NONE,
)
