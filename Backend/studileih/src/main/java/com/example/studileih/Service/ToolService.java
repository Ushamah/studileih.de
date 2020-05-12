package com.example.studileih.Service;

import com.example.studileih.Entity.Tool;

import java.util.List;
import java.util.Optional;

public interface ToolService {

    List<Tool> listAllTool();

    void saveOrUpdateTool(Tool example);

    Optional<Tool> getToolById(Long id);

    void deleteTool(Long id);
}
