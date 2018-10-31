package com.pulses.pulse.model;


public class SpringBootSecureApiApplicationTests  {
    /*@Test
    public void testDatabaseAuthVariablesAuthorization() throws InterruptedException {
        Map<String, Object> authVariableOverrides = ImmutableMap.<String, Object>of(
                "uid", "test",
                "custom", "secret"
        );
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://pulseyourlife-a8037.firebaseio.com")
                .build();
        FirebaseApp testUidApp = FirebaseApp.initializeApp(options, "testGetAppWithUid");
        FirebaseDatabase masterDb = FirebaseDatabase.getInstance(masterApp);
        FirebaseDatabase testAuthOverridesDb = FirebaseDatabase.getInstance(testUidApp);

        assertWriteSucceeds(masterDb.getReference());

        // "test" UID can only read/write to /test-uid-only and /test-custom-field-only locations.
        assertWriteFails(testAuthOverridesDb.getReference());
        assertWriteSucceeds(testAuthOverridesDb.getReference("test-uid-only"));
        assertReadSucceeds(testAuthOverridesDb.getReference("test-uid-only"));
        assertWriteSucceeds(testAuthOverridesDb.getReference("test-custom-field-only"));
        assertReadSucceeds(testAuthOverridesDb.getReference("test-custom-field-only"));*/
    }



}
