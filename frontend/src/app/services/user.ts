import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class User {

  http = inject(HttpClient);

  private apiUrl = 'http://localhost:8080/user'; // URL de mi backend

  getAllUsers(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/all`);
  }

}
