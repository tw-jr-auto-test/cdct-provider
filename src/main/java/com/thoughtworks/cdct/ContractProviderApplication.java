package com.thoughtworks.cdct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;

@SpringBootApplication
public class ContractProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(ContractProviderApplication.class, args);
	}

}
