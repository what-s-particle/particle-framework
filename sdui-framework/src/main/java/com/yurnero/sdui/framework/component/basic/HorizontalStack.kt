package com.yurnero.sdui.framework.component.basic

import com.yurnero.sdui.framework.component.layout.AlignmentToken
import com.yurnero.sdui.framework.component.layout.ArrangementToken
import kotlinx.serialization.Serializable

@Serializable
data class HorizontalStack(
    val elements: MutableList<Component> = mutableListOf(),
    val arrangement: ArrangementToken?,
    val alignment: AlignmentToken?
)
