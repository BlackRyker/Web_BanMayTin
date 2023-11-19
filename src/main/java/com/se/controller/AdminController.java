package com.se.controller;

import com.se.entity.SanPham;
import com.se.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private SanPhamService sanPhamService;

	@GetMapping("/")
	public String getAllSanPham(Model model) {
		List<SanPham> sanPhams = sanPhamService.getAllSanPham();
		model.addAttribute("sanPhams", sanPhams);
		return "home";
	}

	@GetMapping("/product/{id}")
	public String getSanPhamById(@PathVariable int id, Model model) {
		SanPham sanPham = sanPhamService.getSanPhamById(id);
		model.addAttribute("sanPham", sanPham);
		return "detail";
	}

	
	@PostMapping("/product")
	public String saveSanPham(@ModelAttribute("sanPham") SanPham sanPham) {
		sanPhamService.saveSanPham(sanPham);
		return "redirect:/sanpham/";
	}

	@PostMapping("/product/delete/{id}")
	public String deleteSanPham(@PathVariable int id) {
		sanPhamService.deleteSanPham(id);
		return "redirect:/sanpham/";
	}
}