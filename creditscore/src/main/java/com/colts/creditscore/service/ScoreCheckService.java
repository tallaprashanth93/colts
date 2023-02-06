package com.colts.creditscore.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class ScoreCheckService {

	public String getScore() {
		
		String str=null;
		List<Integer> list=new ArrayList<>();
		
		list.add(740);
		list.add(743);
		list.add(747);
		list.add(733);
		list.add(739);
		list.add(736);
		list.add(765);
		list.add(770);
		list.add(775);
		list.add(780);
		list.add(783);
		list.add(790);
		list.add(800);
		list.add(810);
		list.add(820);
		Random random=new Random();
		int score=list.get(random.nextInt(list.size()));
		if(score>730 && score<750)
		{
			str=""+score+"\n better luck next time";
		}else if(score>749) {
			str=""+score+"\n you are eligible for loans";
		}
		
			
			return str;
	}

}
