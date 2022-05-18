package com.smola.spell

class Spell(var name: String,
            var level: Int,
            var school: String,
            var castingTime: String,
            var range: String,
            var area: String,
            var attack: String,
            var save: String,
            var effect: String,
            var ritual: Boolean,
            var concentration: Boolean,
            var target: String,
            var verbal: Boolean,
            var somantic: Boolean,
            var material: Boolean,
            var components: String,
            var duration: String,
            var classes: List[String],
            var description: String
           ) {


  def canEqual(other: Any): Boolean = other.isInstanceOf[Spell]

  override def equals(other: Any): Boolean = other match {
    case that: Spell =>
      (that canEqual this) &&
        name == that.name &&
        level == that.level &&
        school == that.school &&
        castingTime == that.castingTime &&
        range == that.range &&
        area == that.area &&
        attack == that.attack &&
        save == that.save &&
        effect == that.effect &&
        ritual == that.ritual &&
        concentration == that.concentration &&
        target == that.target &&
        verbal == that.verbal &&
        somantic == that.somantic &&
        material == that.material &&
        components == that.components &&
        duration == that.duration &&
        classes == that.classes &&
        description == that.description
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(name, level, school, castingTime, range, area, attack, save, effect, ritual, concentration, target, verbal, somantic, material, components, duration, classes, description)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }

  override def toString = s"Spell($name, $level, $school, $castingTime, $range, $area, $attack, $save, $effect, $ritual, $concentration, $target, $verbal, $somantic, $material, $components, $duration, $classes, $description)"
}
