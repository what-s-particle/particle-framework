package com.yurnero.particle.framework.component.basic

import com.yurnero.particle.framework.Particle
import com.yurnero.particle.framework.component.layout.AlignmentToken
import com.yurnero.particle.framework.component.layout.ArrangementToken
import kotlinx.serialization.Serializable

@Serializable
data class HorizontalStack(
    var elements: MutableList<Particle> = mutableListOf(),
    var arrangement: ArrangementToken = ArrangementToken.CENTER,
    var alignment: AlignmentToken = AlignmentToken.CENTER_HORIZONTALLY
)
