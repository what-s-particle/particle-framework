package com.yurnero.sc.framework.component.layout

import com.yurnero.sc.framework.component.graphics.SizeToken
import kotlinx.serialization.Serializable

@Serializable
data class PaddingModifier(
    var start: SizeToken = SizeToken.NONE,
    var top: SizeToken = SizeToken.NONE,
    var end: SizeToken = SizeToken.NONE,
    var bottom: SizeToken = SizeToken.NONE,
)
