package com.spotlightproducts.WebAPI;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spotlightproducts.businesslibrary.UserDashboard;
import com.spotlightproducts.dao.DatabaseResponse;
import com.spotlightproducts.dao.JSONResponse;
import com.spotlightproducts.dao.Order;
import com.spotlightproducts.dao.Review;
import com.spotlightproducts.dao.User;

@RestController
public class SellerDashBoardAPIController{
	
	@RequestMapping(value = "/SellerStatisticsGet", method = RequestMethod.GET)
	public ResponseEntity<JSONResponse<Order>> getSellerStatistics(@RequestBody User user, HttpServletRequest request){
		JSONResponse<Order> JsonResponse = new JSONResponse<Order>();
		HttpSession session = request.getSession();
		user.setEmail((String)session.getAttribute("email"));
		UserDashboard dashboad = new UserDashboard();
		DatabaseResponse<Order> dbresponse = dashboad.getUserOrders(user);
		JsonResponse.setStatus(dbresponse.getStatus());
		JsonResponse.setMessage(dbresponse.getMessage());
		JsonResponse.setData(dbresponse.getData());
		return new ResponseEntity<JSONResponse<Order>>(JsonResponse, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/SellerLowStockIndicator", method = RequestMethod.GET)
	public ResponseEntity<JSONResponse<Review>> getSellerLowStockIndicator(@RequestBody User user, HttpServletRequest request){
		JSONResponse<Review> JsonResponse = new JSONResponse<Review>();
		HttpSession session = request.getSession();
		user.setEmail((String)session.getAttribute("email"));
		UserDashboard dashboad = new UserDashboard();
		DatabaseResponse<Review> dbresponse = dashboad.getUserReviews(user);
		JsonResponse.setStatus(dbresponse.getStatus());
		JsonResponse.setMessage(dbresponse.getMessage());
		JsonResponse.setData(dbresponse.getData());
		return new ResponseEntity<JSONResponse<Review>>(JsonResponse, HttpStatus.OK);
	}
}