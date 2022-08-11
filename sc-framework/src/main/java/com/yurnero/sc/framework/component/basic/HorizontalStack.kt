package com.yurnero.sc.framework.component.basic

import com.yurnero.sc.framework.component.layout.AlignmentToken
import com.yurnero.sc.framework.component.layout.ArrangementToken
import kotlinx.serialization.Serializable

@Serializable
data class HorizontalStack(
    var elements: MutableList<Component> = mutableListOf(),
    var arrangement: ArrangementToken? = null,
    var alignment: AlignmentToken? = null
)
