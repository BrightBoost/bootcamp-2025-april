package com.example.firstapp.controller;

import com.example.firstapp.dao.LanguageDao;
import com.example.firstapp.model.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LanguageController {
    private LanguageDao languageDao;

    @Autowired
    public LanguageController(LanguageDao languageDao) {
        this.languageDao = languageDao;
    }

    @GetMapping("language")
    public List<Language> getAllLanguages() {
        return languageDao.getAllLanguages();
    }

    @GetMapping("language/{id}")
    public Language getLanguageById(@PathVariable int id) {
        return languageDao.getLanguageById(id);
    }

    @PostMapping("language")
    public Language addLanguage(@RequestBody Language language) {
        return languageDao.addLanguage(language);
    }

    @PutMapping("language/{id}")
    public String updateLanguage(@PathVariable int id, @RequestBody Language language) {
        boolean success = languageDao.updateLanguage(id, language);
        if (success) {
            return "Language updated successfully.";
        } else {
            return "Language not found or update failed.";
        }
    }

    @DeleteMapping("language/{id}")
    public String deleteLanguage(@PathVariable int id) {
        boolean success = languageDao.deleteLanguage(id);
        if (success) {
            return "Language deleted.";
        } else {
            return "Language not found or deleted.";
        }
    }

}
