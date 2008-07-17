package org.springframework.batch.sample.mapping;

import org.springframework.batch.item.file.mapping.FieldSet;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.sample.domain.Player;

public class PlayerFieldSetMapper implements FieldSetMapper {

	public Object mapLine(FieldSet fs, int lineNum) {
		
		if(fs == null){
			return null;
		}
		
		Player player = new Player();
		player.setID(fs.readString("ID"));
		player.setLastName(fs.readString("lastName"));
		player.setFirstName(fs.readString("firstName"));
		player.setPosition(fs.readString("position"));
		player.setDebutYear(fs.readInt("debutYear"));
		player.setBirthYear(fs.readInt("birthYear"));
		
		return player;
	}
	

}
