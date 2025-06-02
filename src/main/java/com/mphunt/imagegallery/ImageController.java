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
                new ImageDTO("Poker Game", "https://www.theartist.me/wp-content/uploads/2021/05/download-4-1.jpg"),
                new ImageDTO("Rainy Day, Boston", "https://www.theartist.me/wp-content/uploads/2021/05/1280px-Childe_Hassam_-_Rainy_Day_Boston_-_Google_Art_Project-1024x547.jpg"),
                new ImageDTO("Water Lillies and the Japanese Bridge", "https://www.theartist.me/wp-content/uploads/2021/05/water-lily-pond-with-japanese-bridge.jpg"),
                new ImageDTO("The Drowning Girl", "https://www.theartist.me/wp-content/uploads/2021/05/6530203451_43ef56b1a5_b.jpg"),
                new ImageDTO("The Boating Party", "https://www.theartist.me/wp-content/uploads/2021/05/the_boating_party_1963.10.94-2048x1579.jpg"),
                new ImageDTO("The Cracked Cardinal", "https://www.theartist.me/wp-content/uploads/2021/05/1200px-George_Condo_The_Cracked_Cardinal-843x1024.jpg"),
                new ImageDTO("Composition VII", "https://www.theartist.me/wp-content/uploads/2021/05/36-1536x1098.jpg"),
                new ImageDTO("Victory Boogie Woogie", "https://www.theartist.me/wp-content/uploads/2021/05/cri_000000477212-1024x1021.jpg"),
                new ImageDTO("The Scream", "https://www.theartist.me/wp-content/uploads/2021/05/the-scream-by-edvard-munch-a-critical-analysis-1024x576.jpg"),
                new ImageDTO("Disintegration of the Persistence of Memory", "https://www.theartist.me/wp-content/uploads/2021/05/8029c23eb07c4f81101ce8c66daf2421-1536x1193.jpg")
        );
    }
}
