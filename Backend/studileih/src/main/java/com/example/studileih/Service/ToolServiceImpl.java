package com.example.studileih.Service;

import com.example.studileih.Entity.Tool;
import com.example.studileih.Repository.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ToolServiceImpl implements ToolService {

    @Autowired
    private ToolRepository toolRepository;

    @Override
    public void saveOrUpdateTool(Tool tool) {
        toolRepository.save(tool);
    }

    @Override
    public Optional<Tool> getToolById(Long id) {
        return toolRepository.findById(id);
    }

    @Override
    public void deleteTool(Long id) {
        toolRepository.deleteById(id);
    }

    @Override
    public List<Tool> listAllTool() {
        List<Tool> tools = new ArrayList<>();
        toolRepository.findAll().forEach(tools::add);
        return tools;
    }
}