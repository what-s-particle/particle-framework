package com.yurnero.sc.framework.component.basic

import com.yurnero.sc.framework.component.layout.AlignmentToken
import com.yurnero.sc.framework.component.layout.ArrangementToken
import kotlinx.serialization.Serializable

@Serializable
data class HorizontalStack(
    val elements: MutableList<Component> = mutableListOf(),
    val arrangement: ArrangementToken?,
    val alignment: AlignmentToken?
)
