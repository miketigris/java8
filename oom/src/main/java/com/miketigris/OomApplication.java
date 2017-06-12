package com.miketigris;

import com.miketigris.oom.*;
import com.miketigris.oom.listener.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OomApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(OomApplication.class);
		springApplication.addListeners(new ApplicationEnvironmentPreparedListener(),
				new ApplicationFailedListener(),
				new ApplicationPreparedListener(),
				new ApplicationReadyListener(),
				new ApplicationStartingListener(),
				new DirectMemoryOOM()
				//new RuntimeConstantPoolOOM()
//				new JavaMethodAreaOOM()
//		new RuntimeConstantPoolOOM2()
				//new HeapOOM(),
				//new JavaVMStackSOF(),
//				new JavaVMStackOOM(),   //小心会死机
		);
		springApplication.run(args);
	}
}
