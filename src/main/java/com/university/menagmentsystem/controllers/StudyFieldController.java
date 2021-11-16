package com.university.menagmentsystem.controllers;

import com.university.menagmentsystem.DTO.StudyFieldDto;
import com.university.menagmentsystem.models.StudyField;
import com.university.menagmentsystem.services.StudyFieldManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ums/stfield")
public class StudyFieldController {
    @Autowired
    private StudyFieldManagementService studyFieldManagementService;

    @GetMapping("/all")
    public List<StudyField> getAllStudyFields() {
        List<StudyField> studyFieldList = studyFieldManagementService.getAllFields();
        return studyFieldList;
    }

    @PostMapping("/new")
    public  StudyField saveStudyField(@RequestBody StudyField studyField){
        return studyFieldManagementService.addField(studyField);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<StudyFieldDto> getStudyField(@PathVariable(value = "id") Long id) {
        StudyFieldDto studyFieldDto = studyFieldManagementService.readField(id);
        return ResponseEntity.ok(studyFieldDto);
    }
    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<String> deleteStudyField(@PathVariable("id") Long id) {

        try {
            studyFieldManagementService.deleteField(id);

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(String.format("Study Field with id %d not found", id));
        }
        return ResponseEntity.ok("Study Field successfully deleted") ;
    }
    @PutMapping("/update")
    public StudyField updateStudyField(@RequestBody StudyField studyField) {
        return studyFieldManagementService.addField(studyField);
    }
}
