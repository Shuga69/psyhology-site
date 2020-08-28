package vladyslav.shuhai.psyhology;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import vladyslav.shuhai.psyhology.service.FileStorageService;

import javax.annotation.Resource;

@SpringBootApplication
public class PsyhologyApplication implements CommandLineRunner {
    @Resource
    FileStorageService storageService;
    public PsyhologyApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(PsyhologyApplication.class, args);
    }
    @Override
    public void run(String... arg) throws Exception {
        storageService.deleteAll();
        storageService.init();
    }
}

