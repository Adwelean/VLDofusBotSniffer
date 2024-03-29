package fr.lewon.dofus.bot.sniffer.model.types.fight.charac.impl

import fr.lewon.dofus.bot.core.io.stream.ByteArrayReader
import fr.lewon.dofus.bot.sniffer.model.types.fight.charac.CharacterCharacteristic

open class CharacterCharacteristicDetailed : CharacterCharacteristic() {

    var base = 0
    var additional = 0
    var objectsAndMountBonus = 0
    var alignGiftBonus = 0
    var contextModif = 0

    override fun deserialize(stream: ByteArrayReader) {
        super.deserialize(stream)
        base = stream.readVarShort()
        additional = stream.readVarShort()
        objectsAndMountBonus = stream.readVarShort()
        alignGiftBonus = stream.readVarShort()
        contextModif = stream.readVarShort()
    }
}