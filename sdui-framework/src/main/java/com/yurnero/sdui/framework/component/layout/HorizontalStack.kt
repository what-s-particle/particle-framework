package com.yurnero.sdui.framework.component.layout

import kotlinx.serialization.Serializable

@Serializable
data class HorizontalStack(var elements: MutableList<Component>)
