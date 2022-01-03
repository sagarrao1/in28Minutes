package com.in28Minutes.multiThreading;

//We can create threads in 2 ways
//1. extending Thread class  
//    we need have run() in that class
//2. Implementing Runnable interface  
//    We need to implement run method in that class , use that instance of class in Thread class	

// Using Thread class
class Task1 extends Thread{
	public void run() {  // signature should match
		System.out.println("Task 1 Started ...");
		for (int i = 101; i < 199; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nTask 1 Done");
	}
}

//using Runnable interface
class Task2 implements Runnable{

	@Override
	public void run() {
		System.out.println("\nTask 2 Started ...");
		for (int i = 201; i < 299; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nTask 2 Done");		
	}	
}


public class ThreadBasicsRunner2 {
	
/*
Task 1 Kicked off
Task 2 Kicked off
Task 1 Started ...
101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126 127 128 129 130 131 132 133 
Task 3 Kicked off
134 201 135 
Task 2 Started ...
202 201 202 203 204 205 206 207 208 209 210 211 136 212 213 214 215 216 217 218 219 220 221 222 223 224 225 226 227 228 229 230 231 232 233 234 235 236 237 238 239 240 241 242 243 244 245 246 247 248 249 250 251 252 253 254 255 256 257 258 259 260 261 262 263 264 265 266 267 268 269 203 204 205 206 207 208 209 210 211 212 213 214 215 216 217 218 270 271 137 138 272 273 274 275 276 277 278 279 280 281 282 283 284 285 286 287 219 220 221 222 288 289 290 291 292 293 294 139 140 141 142 295 296 297 298 
Task 2 Done
223 143 224 144 145 146 147 148 149 150 151 152 153 154 155 225 226 227 228 229 156 230 157 158 159 160 161 162 231 163 164 165 166 167 168 169 170 232 233 234 235 236 237 238 239 240 241 242 243 244 245 246 247 248 249 250 251 252 253 254 255 256 257 258 259 260 261 262 263 264 265 266 267 268 269 270 271 272 273 274 275 276 277 278 279 280 281 282 283 284 285 286 287 288 289 290 291 292 293 294 295 296 297 298 299 300 301 302 303 304 305 306 307 308 309 310 311 312 313 314 315 316 317 318 319 320 321 322 323 324 325 326 327 328 329 330 331 332 333 334 335 336 337 338 339 340 341 342 343 344 345 346 347 348 349 350 351 352 353 354 355 356 357 358 359 360 361 362 363 364 365 366 367 368 369 370 371 372 373 374 375 376 377 378 379 380 381 171 382 383 384 385 386 387 388 389 390 391 392 393 172 173 394 174 175 176 177 178 179 180 395 396 181 182 183 397 398 
Task 3 Done
Main Task Done......
184 185 186 187 188 189 190 191 192 193 194 195 196 197 198 
Task 1 Done */
	
  /*
   * NEW
   * RUNNABLE
   * RUNNING 
   * BLOCKED/WAITING
   * TERMINATED/DEAD
   */
	
	/* Thread Priority. priority is just a hint. might not be honored
	 *  Low priority =1
	 *  Normal priority =5
	 *  HIgh priority =10
	 */
  
	public static void main(String[] args) throws InterruptedException {
		// Task 1
		System.out.println("\nTask 1 Kicked off");
		Task1 task1 = new Task1();
		task1.setPriority(1); //low priority
		task1.start();		
		// if we say task1.run() here, it will exeute as normal method calling in that class
		
		// Task 2
		System.out.println("\nTask 2 Kicked off");
		Task2 task2 = new Task2();
		Thread task2Thread =new Thread(task2);
		task2Thread.setPriority(10); //high priority
		task2Thread.start();
		
//		wait for task1 to complete before task3 (main) starts
		task1.join();
		task2Thread.join();
		
		
		// Task 3
		System.out.println("\nTask 3 Kicked off");
		for (int i = 301; i < 399; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nTask 3 Done");

		System.out.println("Main Task Done......");
		
		
		Thread.sleep(1000); // 1 sec
		Thread.yield();
	}

}
