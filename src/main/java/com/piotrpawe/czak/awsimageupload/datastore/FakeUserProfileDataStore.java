package com.piotrpawe.czak.awsimageupload.datastore;

import com.piotrpawe.czak.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static{
        USER_PROFILES.add(new UserProfile(UUID.fromString("bef9eba9-d845-4639-8aa9-fc5329e621f8"), "Ania", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("330b2576-05a2-4e35-b907-bc08a3134146"), "Przemek", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
