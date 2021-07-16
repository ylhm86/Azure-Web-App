package com.vmttx.utilities;

import com.vmttx.pages.properties.PropertiesPage;
import com.vmttx.pages.experiences.ExperiencesPage;
import com.vmttx.pages.contentlibrary.ContentLibraryPage;
import com.vmttx.pages.login_navigation.LoginPage;

public class Pages {
    private LoginPage loginPage;
    private PropertiesPage propertiesPage;
    private ExperiencesPage experiencePage;
    private ContentLibraryPage contentLibraryPagePage;

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public PropertiesPage propertiesPage() {
        if (propertiesPage == null) {
            propertiesPage = new PropertiesPage();
        }
        return propertiesPage;
    }

    public ContentLibraryPage contentLibraryPage() {
        if (contentLibraryPagePage == null) {
            contentLibraryPagePage = new ContentLibraryPage();
        }
        return contentLibraryPagePage;
    }

    public ExperiencesPage experiencesPage() {
        if (experiencePage == null) {
            experiencePage = new ExperiencesPage();
        }
        return experiencePage;
    }

}
