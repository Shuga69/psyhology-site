package vladyslav.shuhai.psyhology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vladyslav.shuhai.psyhology.dto.request.NewsletterRequest;
import vladyslav.shuhai.psyhology.dto.request.UserRequest;
import vladyslav.shuhai.psyhology.service.NewsletterService;

import javax.validation.Valid;

@CrossOrigin(origins = "https://psyhology-site.herokuapp.com/")
@RestController
@RequestMapping("/news")
public class NewsletterController {
    @Autowired
    private NewsletterService newsletterService;

    @PostMapping("/subscribe")
    public final void create(@Valid @RequestBody final NewsletterRequest request) {
        newsletterService.create(request);
    }

}
