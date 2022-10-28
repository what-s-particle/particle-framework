package com.yurnero.particle.framework.component.basic.text

import com.yurnero.particle.framework.component.graphics.ColorToken
import com.yurnero.particle.framework.component.graphics.SizeToken
import kotlinx.serialization.Serializable

@Serializable
data class TextView(
    var text: String,
    var colorToken: ColorToken? = null,
    var colorValue: Int? = null,
    var weightToken: FontWeightToken? = null,
    var sizeToken: SizeToken? = null,
    var sieValue: Double? = null,
    var styleToken: FontStyleToken? = null,
    var familyToken: FontFamilyToken? = null,
    var textDecoration: MutableList<TextDecorationToken>? = null,
    var textAlignment: TextAlignmentToken? = null,
    var maxLine: Int? = null
)
