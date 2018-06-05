package com.myolisi.gitlib.controller;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.google.common.reflect.TypeToken;
import com.myolisi.gitlib.Videos;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GifController {

    @RequestMapping(value = "/")
    @ResponseBody
    public String listGifs(){
        return "List of all the gifs!";
    }

    @RequestMapping (value = "/users")
    @ResponseBody
    public List<String> getUsers(){
        List<String> users = new ArrayList<>();
        users.add("James May");
        users.add("Jeremy Clarkson");
        users.add("Rischard Harmmond");
        users.add("THe Stig");
        return users;
    }

    @RequestMapping (value = "/videos")
    @ResponseBody
    public List<Videos> getVideos(){

        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect("killr_video");
        ResultSet results = session.execute("SELECT * FROM videos");
        System.out.println("sd");

        List<Videos> movies = new ArrayList<>();


        for (Row row : results) {
            movies.add(new Videos(row.getUUID("video_id"), row.getString("description"),
                    row.getString("title"), row.getUUID("user_id"),
                    row.getSet("genres", TypeToken.of(String.class)), row.getSet("tags", TypeToken.of(String.class))));
        }
        return movies ;
    }
}
