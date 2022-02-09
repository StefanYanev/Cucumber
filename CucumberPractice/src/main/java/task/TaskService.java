package task;

import models.User;
import models.Role;
import models.Status;
import models.Task;

public class TaskService {
	
	public static String chooseProject(final User user, final String projectName) {
		final String result;
		boolean isManager = user.getRoles().stream().anyMatch(r -> "manager".equals(r.getManager()));
		if (isManager) {
			if(null == projectName || projectName.isBlank()) {
				result = "Няма такъв наличен проект";
			} else {
				result = "Избрахте конкретния проект";
			}
			
		} else {
			result = "Само мениджъра има право да избира от наличните проекти!";
		}
		return result;
	}
	
	public static String chooseTask(final User user, final String taskName) {
		String result;
		
		boolean isNeww = false ;
		if(isNeww == true) {
			result = "Започвате работа по нова задача!";			
		} else {
			result = "Изберете от задачите, които са в процес на разработка!";
		}
		
		boolean isWorkedOn = false;
		if (isWorkedOn == true) {
			result = "Започвате работа по задача, която е в процес на разработка!";
		} else {
			result = "Задачата, която избрахте не е налична!";
		}
		
		boolean isDevelopped = false;
		if(isDevelopped == true) {
			result = "Задачата, която избрахте вече е разработена!";
		}
		
		boolean isCancelled = false;
		if(isCancelled == true) {
			result = "Задачата, която избрахте е отказана!";
		}
						
		return result;
	}
		

}
