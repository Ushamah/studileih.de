package com.example.studileih.Service;

import com.example.studileih.Entity.Product.Tool;

import java.util.List;
import java.util.Optional;

public interface ToolService {

    List<Tool> listAllTool();

    void saveOrUpdateTool(Tool tool);

    Optional<Tool> getToolById(Long id);

    void deleteTool(Long id);
}
