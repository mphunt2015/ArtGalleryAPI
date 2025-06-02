package com.mphunt.imagegallery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/images")
public class ImageController {

    @GetMapping
    public List<ImageDTO> getImages() {
        return List.of(
                new ImageDTO("Students", "https://www.ucl.ac.uk/bartlett/sites/bartlett/files/styles/department_hero_mobile/public/2025-04/IIPP%20MPA%20-%20240205_J-TYE_UCL_209_Bartlett_3031.jpg.jpg?itok=ujh4sNOw"),
                new ImageDTO("Collaboration", "https://www.mpg.de/11722646/header_image-1653994062.jpg?t=eyJ3aWR0aCI6ODQ4LCJmaWxlX2V4dGVuc2lvbiI6ImpwZyIsIm9ial9pZCI6MTE3MjI2NDZ9--6c7113e80443d020de403f3f92c0b6cc175f4fbc"),
                new ImageDTO("Talking", "https://aspph-redesign-wp-production.s3.amazonaws.com/wp-content/uploads/2025/04/54454151678_69e7852494_o-1024x683.jpg")
        );
    }
}
