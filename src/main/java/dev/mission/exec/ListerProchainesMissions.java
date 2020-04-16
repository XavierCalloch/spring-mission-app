package dev.mission.exec;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.mission.repository.MissionRepository;

@Controller
@Profile("listerProchainesMissions")
public class ListerProchainesMissions implements Runnable {

	private MissionRepository missionRepository;

	public ListerProchainesMissions(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		System.out.println(missionRepository.listerProchainesMissions());
	}

}
