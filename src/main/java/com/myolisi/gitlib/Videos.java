package com.myolisi.gitlib;

import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

public class Videos {

        private UUID video_id;
        private Timestamp added_date;
        private String description;
        private Set<String> encoding;
        private Set<String> genres;
        private String title;
        private UUID user_id;


        private Set<String> tags;

        public Videos(UUID video_id, String description, String title, UUID user_id, Set<String> genres, Set<String> tags) {
            this.video_id = video_id;
            this.added_date = added_date;
            this.description = description;
            this.encoding = encoding;
            this.title = title;
            this.user_id = user_id;
            this.genres = genres;
            this.tags = tags;
            this.encoding = encoding;
        }


        public Set<String> getGenres() {
            return genres;
        }

        public void setGenres(Set<String> genres) {
            this.genres = genres;
        }

        public UUID getVideo_id() {
            return video_id;
        }

        public void setVideo_id(UUID video_id) {
            this.video_id = video_id;
        }

        public Timestamp getAdded_date() {
            return added_date;
        }

        public void setAdded_date(Timestamp added_date) {
            this.added_date = added_date;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public UUID getUser_id() {
            return user_id;
        }

        public void setUser_id(UUID user_id) {
            this.user_id = user_id;
        }


        public Set<String> getEncoding() {
            return encoding;
        }

        public void setEncoding(Set<String> encoding) {
            this.encoding = encoding;
        }

        public Set<String> getTags() {
            return genres;
        }

        public void setTags(Set<String> tags) {
            this.genres = tags;
        }

}
