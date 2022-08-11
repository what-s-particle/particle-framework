package com.yurnero.sc.framework.component.basic.text

import com.yurnero.sc.framework.component.graphics.ColorToken
import com.yurnero.sc.framework.component.graphics.SizeToken
import kotlinx.serialization.Serializable

@Serializable
data class TextView(
    val text: String,
    val colorToken: ColorToken? = null,
    val colorValue: Int? = null,
    val weightToken: FontWeightToken? = null,
    val sizeToken: SizeToken? = null,
    val sieValue: Double? = null,
    val styleToken: FontStyleToken? = null,
    val familyToken: FontFamilyToken? = null,
    val textDecoration: MutableList<TextDecorationToken>? = null,
    val textAlignment: TextAlignmentToken? = null,
    val maxLine: Int? = null
)
